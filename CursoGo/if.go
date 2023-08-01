package main

import "fmt"

func main() {
	if 7%2 == 0 {
		fmt.Println("7 é par")
	} else {
		fmt.Println("7 é ímpar")
	}

	if 8%4 == 0 {
		fmt.Println("8 é divisivel por 4")
	}

	if num := 9; num < 0 {
		fmt.Println(num, "é negativo")
	} else if num < 10 {
		fmt.Println(num, "tem um digito")
	} else {
		fmt.Println("tem varios digitos")
	}

}
