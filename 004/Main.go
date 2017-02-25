package main

import "fmt"

func main() {
	largestPalindrome := 0
	for i := 100; i < 1000; i++ {
		for j := 100; j < 1000; j++ {
			if isPalindrome(i*j) && i*j > largestPalindrome {
				largestPalindrome = i * j
			}
		}
	}
	fmt.Println(largestPalindrome)
}
func isPalindrome(n int) bool {
	num := n
	rev := 0
	for num != 0 {
		rev = (rev * 10) + (num % 10)
		num /= 10
	}
	return n == rev
}
