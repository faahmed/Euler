package main

import (
	"fmt"
	"math"
)

func main() {
	lastPrime := 13
	i := 6
	for i < 10001 {
		lastPrime += 2
		isPrime := true
		for j := 2; j <= int(math.Sqrt(float64(lastPrime))); j++ {
			if lastPrime%j == 0 {
				isPrime = false
				break
			}
		}
		if isPrime {
			i++
		}
	}
	fmt.Println(lastPrime)
}
