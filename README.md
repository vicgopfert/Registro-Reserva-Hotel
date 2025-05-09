
# 🏨 Sistema de Registro e Reserva de Hotel

Este projeto é um sistema simples para gerenciamento de reservas em um hotel. Ele permite o cadastro de hóspedes, definição de tipos de quartos, realização de reservas e geração de um relatório contendo todas as reservas realizadas.

---

## 🛠️ Funcionalidades

- Cadastro de hóspedes com nome, CPF e telefone.
- Registro de diferentes tipos de quartos: Comum, Plus e Premium.
- Realização de reservas associadas a hóspedes e quartos disponíveis.
- Cálculo do valor total da reserva com base no tipo de quarto e diárias.
- Geração de relatório em formato `.txt` com todas as reservas registradas.
- Interface por linha de comando via classe controladora.

---

## 🛠️ Tecnologias Utilizadas

- Java 11+
- Maven para gerenciamento de dependências e build
- Padrão MVC (Model-View-Controller)

---

## 📦 Estrutura do Projeto

O projeto segue o padrão de camadas com os seguintes pacotes e arquivos principais:

```
Registro_Reserva_de_Hotel/
├── pom.xml
├── relatorio_reservas.txt
├── src/
│   └── main/
│       └── java/
│           └── VictorGopfert/
│               ├── Controller/
│               │   └── SistemaReservaController.java
│               └── Model/
│               │   ├── Comum.java
│               │   ├── Plus.java
│               │   ├── Premium.java
│               │   ├── Hospede.java
│               │   ├── Quarto.java
│               │   └── Reserva.java
│               ├── View/
│                   └── Main.java
│                   └── RelatorioReservaView.java
```

---

## 🧠 Conceitos de POO utilizados

Este sistema foi desenvolvido com os principais pilares da Programação Orientada a Objetos:

✅ **Encapsulamento**  
- Atributos das classes estão encapsulados com modificadores de acesso.  
- Getters e setters controlam o acesso e a modificação dos dados.  

✅ **Herança**  
- A classe `Quarto` serve como superclasse para os quartos `Comum`, `Plus` e `Premium`.  
- Cada tipo de quarto herda características comuns e pode sobrepor comportamentos.  

✅ **Polimorfismo**  
- O método de cálculo de valor da diária é implementado de forma polimórfica por cada tipo de quarto.  
- O sistema trata todos os tipos de quarto de maneira genérica, adaptando-se ao tipo em tempo de execução.  

✅ **Abstração**  
- A classe abstrata `Quarto` define o contrato básico para os tipos de quartos.  
- As subclasses implementam os detalhes específicos como valor adicional por tipo.

---

## 📄 Exemplo de Saída do Relatório

```
RELATÓRIO DE RESERVAS DE HOTEL
------------------------------------------
ID da Reserva: 1
Hóspede: João Silva
CPF: 12345678900
Quarto Nº: 101
Tipo de Quarto: Comum
Data de Entrada: 01/05/2025
Data de Saída: 05/05/2025
Total de Dias Reservados: 4
Total a Pagar: R$600,00
Check-in realizado? Sim
Check-out realizado? Sim
------------------------------------------
ID da Reserva: 2
Hóspede: Maria Souza
CPF: 98765432100
Quarto Nº: 102
Tipo de Quarto: Comum
Data de Entrada: 02/05/2025
Data de Saída: 04/05/2025
Total de Dias Reservados: 2
Total a Pagar: R$300,00
Check-in realizado? Sim
Check-out realizado? Não
```

---

## 📁 Arquivo de Saída

O sistema gera automaticamente o arquivo `relatorio_reservas.txt` com os dados de todas as reservas feitas durante a execução do programa.

---

## 📌 Como Executar

1. Clone este repositório:
```bash
git clone https://github.com/vicgopfert/Registro-Reserva-Hotel.git
```

2. Importe o projeto em uma IDE com suporte a Maven (Eclipse, IntelliJ, VSCode).

3. Compile todos os arquivos e execute a classe `Main.java` para interagir com o sistema.

---

## 👨‍💻 Autor

- **Victor Gopfert Ferreira Figueiredo**
- Matrícula: `202410300711`
- Curso: Análise e Desenvolvimento de Sistemas - UERJ

---

Projeto desenvolvido como prática de Programação Orientada a Objetos com Java.
