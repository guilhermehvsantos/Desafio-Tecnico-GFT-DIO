# Desafio Técnico - GFT / DIO

Este repositório contém a solução para os desafios técnicos propostos pela GFT / DIO.  
O projeto está estruturado em Java e organizado em 3 desafios:

- **Desafio 1:** Calculadora de Anagramas (Lógica de Programação)  
- **Desafio 2:** Corrida de Veículos (POO - Herança e Polimorfismo)
- **Desafio 3:** Prompt para gerar código (LLM - utilização de engenharia de Prompt com IA)

---

## 📁 Estrutura do Projeto

Desafio-Tecnico-GFT-DIO/

├─ src/

│ ├─ Desafio1/

│ │ └─ Main.java # Programa principal para verificar anagramas

│ ├─ Desafio2/

│ │ ├─ Veiculo.java # Classe base abstrata para veículos

│ │ ├─ Carro.java # Subclasse de Veiculo

│ │ ├─ Moto.java # Subclasse de Veiculo

│ │ ├─ Bicicleta.java # Subclasse de Veiculo

│ │ └─ Main.java # Programa principal para corrida de veículos

├─ .gitignore

├─ Desafio tecnico DIO GTF.iml

└─ Prompt.txt

## 📝 Descrição dos Desafios

### Desafio 1 – Calculadora de Anagramas
O programa verifica se duas palavras são **anagramas** (mesmas letras em ordem diferente).  
- Ignora maiúsculas/minúsculas e espaços.  
- Permite que o usuário digite as palavras via console.  
- Deve imprimir se são ou não anagramas.

Saída esperada:
```

Digite a primeira palavra:

Roma

Digite a segunda palavra:

Amor

Resultado: As palavras são anagramas!
```

### Desafio 2 – Corrida de Veículos
O sistema simula uma corrida entre veículos usando **POO, herança e polimorfismo**.  
- Classe base: `Veiculo` (com propriedades `nome` e `velocidade`).  
- Subclasses: `Carro`, `Moto`, `Bicicleta` (cada uma sobrescreve o método `Mover()`).  
- Usuário escolhe dois veículos e o programa mostra como cada um se move.  

Saída esperada:
```
Escolha o primeiro veículo (0-Carro, 1-Moto, 2-Bicicleta): 
0
Escolha o segundo veículo (0-Carro, 1-Moto, 2-Bicicleta): 
2

Veículos escolhidos: Carro vs Bicicleta
Carro: Vruuummmm!
Bicicleta: Pedalando...
```
### Desafio 3 - Exemplo de Prompt para um sistema simples de notas escolares
A tarefa não é escrever o código agora.
Deve-se criar o prompt que enviaria ao ChatGPT para pedir ajuda.

Arquivo prompt.txt

## ⚙️ Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/Desafio-Tecnico-GFT-DIO.git

cd Desafio-Tecnico-GFT-DIO/src

```
2. Compile e execute os programas:
Desafio 1
``` 

javac Desafio1/Main.java

java Desafio1.Main

```
Desafio 2
``` 

javac Desafio2/Main.java Desafio2/Veiculo.java Desafio2/Carro.java Desafio2/Moto.java Desafio2/Bicicleta.java      

java Desafio2.Main
```

## 🖋 Autor

 [Guilherme Santos](https://www.linkedin.com/in/guilhermehvs/) 
