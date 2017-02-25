package main

import "fmt"

func main() {
	sum := 0
	for i := 1; ; i++ {
		if fibi := fib(i); fibi > 4000000 {
			break
		} else if fibi%2 == 0 {
			sum += fibi
		}
	}
	fmt.Println(sum)
}
func fib(n int) int {
	if n == 1 {
		return 1
	} else if n == 2 {
		return 2
	}
	return fib(n-1) + fib(n-2)
}
