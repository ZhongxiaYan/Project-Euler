#include <iostream>
#include <vector>
#include <stdint.h>


class Vl
{
    std::vector<long> v;

public:
    
    Vl() {
        v.push_back(0);
    }

    Vl(long x) {
        v.push_back(x);
    }

    Vl(std::vector<long> x) {
        v = x;
    }

    void print() {
        for (std::vector<long>::size_type i = v.size(); i > 0; --i) {
            std::cout << v[i - 1] << " ";
        }
        std::cout << std::endl;
    }
   
    int sum() {
        int s = 0;
        for (std::vector<long>::size_type i = 0; i < v.size(); ++i) {
            long n = v[i];
            while (n > 0) {
                s += n%10;
                n /= 10;
            }
        }
        return s;

    }
    std::vector<long> getV() {
        return v;
    }
    
    void check() {
        std::vector<long>::size_type i = 0;  
        while (i < v.size()) {
            if (v[i] >= 1000000) {
                int overflow = v[i]/1000000;
                v[i] = v[i]%1000000;
                if (i < v.size() - 1) {
                    v[i+1] += overflow;
                } else {
                    v.push_back(overflow);
                }
            }
            ++i;
        }
        
    }

    Vl operator+(Vl rhs) {
        std::vector<long> v1 = rhs.getV();
        for (std::vector<long>::size_type i = 0; i < v1.size(); ++i) {
            if (i < v.size()) {
                v[i] += v1[i];
            } else {
                v.push_back(v1[i]);
            }
            check();
        }
        return *this;
    }

    Vl operator+(long rhs) {
        v[0] += rhs;
        check();
        return *this;
    }
    
    Vl operator*(long rhs) {
        for (std::vector<long>::size_type i = 0; i < v.size(); ++i) {
            v[i] *= rhs;
        }
        check();
        return *this;
    }


};

class Fraction
{

    Vl num;
    Vl denom;

public:
    Fraction(Vl x, Vl y):
        num(x),
        denom(y)
        {}
    Fraction(): 
        num(1),
        denom(1)
        {}
    void print() {
        num.print();
        std::cout << "/";
        denom.print();
        std::cout << std::endl;
    }
    void sumD() {
        std::cout << num.sum();
    }
    void inv() {
        Vl temp = num;
        num = denom;
        denom = temp;
    }
    Vl getN() {
        return num;
    }
    Vl getD() {
        return denom;
    }
    Fraction operator+(long rhs) {
        return Fraction(denom*rhs + num, denom);
    }

};

int main() {
    std::vector<int> seq;
    for (int i = 1; i <= 33; ++i) {
        seq.push_back(1);
        seq.push_back(2*i);
        seq.push_back(1);
    }
    Fraction first(0, 1);
    while (seq.size() > 0) { 
        int next = seq.back();
        seq.pop_back();
        first = first + next;
        first.inv();
    }
    first = first + 2;
    first.print();
    first.sumD();
    return 0;
}

