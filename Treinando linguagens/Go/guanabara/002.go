package guanabara

import (
	"fmt"
)

func main() {

	var nome string

	fmt.Print("Qual seu nome? ")
	fmt.Scanln(&nome)

	fmt.Printf("Olá %s, é um prazer te conhecer! ", nome)

}
