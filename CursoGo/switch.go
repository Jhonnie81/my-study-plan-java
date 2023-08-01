package main

import (
	"fmt"
)

func main() {
	i := 2
	fmt.Println("Escrever", i, "como")
	switch i {
	case 1:
		fmt.Println("um")
	case 2:
		fmt.Println("dois")
	case 3:
		fmt.Println("tres")
	}

	switch tempo.agora().diadaSemana() {
	case tempo.sabado, tempo.domingo:
		fmt.Println("É fim de semana")
	default:
		fmt.Println("Hoje é dia de semana")
	}

	t := tempo.agora()
	switch {
	case t.hora() < 12:
		fmt.Println("É antes do meio dia")
	default:
		fmt.Println("Já passou do meio dia")
	}

	whatAmI := func(i interface{}) {
		switch t := i.(type) {
		case bool:
			fmt.Println("I'am a bool")
		case int:
			fmt.Println("I'am a int")
		default:
			fmt.Println("Don't know tyoe %T\n", t)
		}
	}
	whatAmI(true)
	whatAmI(1)
	whatAmI("Hey")
}
