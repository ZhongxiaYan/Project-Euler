#include <iostream>
#include <vector>
#include <math.h>

bool prime_gen(int);
std::vector<int> combination(std::vector<int>, int);

int main() {
    std::vector<int> primes;
    primes.push_back(2);
    int last = 1000000;
    for (int j = 3; j <= last; j += 2) {
        if (prime_gen(j)) {
            primes.push_back(j);
        }
    }
    long long count = 0;
    for (int i = 2; i <= last; ++i) {
        count += 1;
        std::vector<int> factors;
        int current = i;
        int root = (int) sqrt(i) + 1;
        int n = 0;
        int fac = 2;
        while (current != 1 && fac <= root) {
            if (current % fac == 0) {
                factors.push_back(fac);
                current = current / fac;
                while (current % fac == 0) 
                    current = current / fac;
            }
            fac = primes[++n];
        }
        if (current > root) factors.push_back(current);
        short add = 1;
        int sum = 0;
        int num = last - i;
        std::vector<int> temp;
        for (int k = 1; k <= factors.size(); ++k) {
            temp = combination(factors, k);
            for (std::vector<int>::iterator it = temp.begin(); it != temp.end(); ++it) {
                sum += add * (num / (*it));
            }
            add = -add;
        }
        count += num - sum;
    }
    std::cout << count;
    return 0;
}

bool prime_gen(int x) {
    for (int i = 2; i <= (int) sqrt(x); ++i) {
        if (x%i == 0)
            return false;
    }
    return true;
}

std::vector<int> combination(std::vector<int> v, int num) {
    if (num == 1)
        return v;
    else {
        std::vector<int> new_v;
        std::vector<int> temp;
        --num;
        while (v.size() >= num) {
            int elem = v.back();
            v.pop_back();
            temp = combination(v, num);
            for (std::vector<int>::iterator it = temp.begin(); it != temp.end(); ++it) {
                new_v.push_back((*it) * elem);
            }
        }
        return new_v;
    }
}

