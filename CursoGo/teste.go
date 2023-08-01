package main

import "fmt"

func main() {
	a := 10
	b := "world"
	c := 3.144
	d := false
	e := `uooooooo
	
	legal
	`
	fmt.Printf("%T \n", a)
	fmt.Printf("%T \n", b)
	fmt.Printf("%T \n", c)
	fmt.Printf("%T \n", d)
	fmt.Printf("%T \n", e)

}
