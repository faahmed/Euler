package main

import "fmt"

func main() {
	ans := 0
	notFound := true
	for i := 20; notFound; i += 20 {
		ans = i
		for j := 1; j <= 20; j++ {
			if i%j != 0 {
				notFound = true
				break
			} else {
				notFound = false
			}
		}
	}
	fmt.Println(ans)
}
