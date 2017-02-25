package main

import (
	"fmt"
	"math"
)

func main() {
	var n, sqrtn, largestPrime int = 600851475143, 775146, 1
	for i := 2; i <= sqrtn; i++ {
		if n%i == 0 {
			if n/i > sqrtn {
				if isPrime(n/i) && n/i > largestPrime {
					largestPrime = n / i
					continue
				}
			}
			if isPrime(i) && i > largestPrime {
				largestPrime = i
			}
		}
	}
	fmt.Println(largestPrime)
}
func isPrime(n int) bool {
	for i := 2; i <= int(math.Sqrt(float64(n))); i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}
