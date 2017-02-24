package main

import (
	"fmt"
	"math"
)

func main() {
	sumOfSquares := 0
	for i := 1; i <= 100; i++ {
		sumOfSquares += i * i
	}
	squareOfSum := math.Pow(100*(101)/2, 2)
	fmt.Println(int(squareOfSum) - sumOfSquares)
}
