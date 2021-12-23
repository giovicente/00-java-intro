Arrays e matrizes (com o for loop)

        // tamanho do array == N, indexes do array == N-1
        // tamanho do array == 4, indexes do array == 3
        String[] disciplinas = {"POO", "Spring", "TDD", "Análise de algoritmos"};
        
        System.out.println(disciplinas.lenght);
        System.out.println(disciplinas[0]);

        for (int i = 0; i < disciplinas.length; i++) {
            disciplinas[i] = JOptionPane.showInputDialog("Digite o nome da disciplina");
        }

        for (String disciplina : disciplinas) {
            System.out.println(disciplina);
        }

Começar a explicar uns tratamentos, alinhados com o que vamos ver nos exercícios

- toCharArray
- adaptar o exercíciio do palavra formatada para retornar somente os ímpares
- mostrar o += concatenando Strings

	String nomeProfessor = Leitor.escanearNomeProfessor();	
	char[] caracteresNomesProfessor = nomeProfessor.toCharArray(); // {'G','i','o' ...}

        String palavraFormatada = "";

        for (int i = 0; i < caracteresNomesProfessor.length; i++) {
            if (i % 2 == 0) {
                palavraFormatada += Character.toUpperCase(caracteresNomesProfessor[i]);
            }
        }

        System.out.println("A palavra formatada é " + palavraFormatada);

- resolver o exercício do palíndromo

        char[] caracteresNomesProfessor = nomeProfessor.toCharArray(); // {'G','i','o' ...}

        String palavraContrario = "";
        for (int i = caracteresNomesProfessor.length - 1; i >= 0; i--) {
            palavraContrario += caracteresNomesProfessor[i];
        }

        if (nomeProfessor.equalsIgnoreCase(palavraContrario)) {
            System.out.println("Palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        } 

        int[][] matrizExemplo = new int[3][3];

        for (int i = 0; i < matrizExemplo.length; i++) {
            for (int j = 0; j < matrizExemplo.length; j++) {
                System.out.println(matrizExemplo[i][j]);
            }
        }