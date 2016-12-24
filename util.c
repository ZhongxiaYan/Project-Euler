inline unsigned long long mult_mod(unsigned long long x, unsigned long long y, unsigned long long m) {
    const unsigned long long max_threshold = ~0ull; // cannot square beyond this point
    const unsigned long long pow2_8 = 1ull << 8;

    if (x < max_threshold / y) {
        return (x * y) % m;
    }
    unsigned long long x1 = x >> 32; // turn x into x1 * 2^32 + x2
    unsigned long long x2 = x - (x1 << 32);

    unsigned long long y1 = y >> 32; // turn x into x1 * 2^32 + x2
    unsigned long long y2 = y - (y1 << 32);

    // calculate y * y * (2^8 ^ 8) + 2 * x * y * (2^8 ^ 4) + x * x
    unsigned long long result1 = (x1 * y1) % m;
    for (int i = 0; i < 8; i++) {
        result1 = (result1 * pow2_8) % m;
    }
    unsigned long long result2 = (x1 * y2 + x2 * y1) % m;
    for (int i = 0; i < 4; i++) {
        result2 = (result2 * pow2_8) % m;
    }
    return (result1 + result2 + (x2 * y2) % m) % m;

}

// calculates x^y (mod p)
inline unsigned long long power(unsigned long long x, unsigned long long y, unsigned long long p)
{
    unsigned long long res = 1;      // Initialize result
    x = x % p;
    while (y > 0) {
        if (y & 1) {
            res = mult_mod(res, x, p);
        } 
        y = y >> 1;
        x = mult_mod(x, x, p);
    }
    return res;
}

// returns 1 if definitely composite
inline int _witness(unsigned long long a, unsigned long long d, unsigned long long n, unsigned int s) {
    // Compute a^d mod n
    unsigned long long x = power(a, d, n);
    if (x == 1 || x == n - 1)
       return 0; 
    while (s > 0) {
        x = mult_mod(x, x, n);
 
        if (x == 1)      return 1;
        if (x == n - 1)  return 0;
        s--;
    }
    return 1;
}
 
// returns 1 if prime else 0
// deterministic Miller-Rabin prime checking for under min(2^64, 2^56) using 
// https://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test#Deterministic_variants
inline int is_prime(unsigned long long n)
{
    const int N0 = 1;
    const int N1 = 7;
    const int N2 = 9;
    const int N3 = 12;
    const unsigned long long a_array0[N0] = { 2ull };
    const unsigned long long a_array1[N1] = { 2ull, 3ull, 5ull, 7ull, 11ull, 13ull, 17ull };
    const unsigned long long a_array2[N2] = { 2ull, 3ull, 5ull, 7ull, 11ull, 13ull, 17ull, 19ull, 23ull };
    const unsigned long long a_array3[N3] = { 2ull, 3ull, 5ull, 7ull, 11ull, 13ull, 17ull, 19ull, 23ull, 29ull, 31ull, 37ull };

    if (n <= 1)       return 0;
    if (n <= 3)       return 1;
    if (!(n & 1))     return 0;
 
    // Find d, s such that n - 1 = 2^s * d for some d >= 1
    unsigned long long d = n - 1;
    unsigned int s = 0;
    while (!(d & 1)) {
        d >>= 1;
        s += 1;
    }
    int N = 0;
    const unsigned long long *a_array = 0;
    if (n < 2047ull) {
        N = N0;
        a_array = a_array0;
    } else if (n < 341550071728321ull) {
        N = N1;
        a_array = a_array1;
    } else if (n < 3825123056546413051ull) {
        N = N2;
        a_array = a_array2;
    } else { // n < 2^64
        N = N3;
        a_array = a_array3;
    }
    for (int i = 0; i < N; i++) {
        if (_witness(a_array[i], d, n, s)) {
            return 0;
        }
    }
    return 1;
}