
        // == >= <= > <
        // Usar JOptionPane nos inputs 
        public static void main(String[] args) {
        int idade = Leitor.escanearIdade();

        int mesesSegundaDose = Leitor.escanearMesesSegundaDose();

        final byte STATUS_FINALIZACAO_INAPTO_VACINA = 1;

        if ((!Validador.validarIdade(idade)) || (mesesSegundaDose < 3)) {
            Impressora.imprimirMensagemInaptoVacina(idade, mesesSegundaDose);
            Leitor.fecharScannerDadosVacinacao();
            System.exit(STATUS_FINALIZACAO_INAPTO_VACINA);
        }

        if (mesesSegundaDose > 5) {
            Impressora.imprimirMensagemAptoTerceiraDose();
        } else {
            Impressora.imprimirMensagemConsulteCalendario();
        }

        Leitor.fecharScannerDadosVacinacao();
    }
    
    // meter um if, depois um while e por fim um do-while (explicar a diferença para os 3)
    public static float calcularHorasTrabalhadas(float salarioProfessor, float valorHoraProfessor) {
        final float VALOR_MINIMO_HORA_AULA = 45f;

        if (valorHoraProfessor < VALOR_MINIMO_HORA_AULA) {
            System.out.printf("O valor hora informado de %.2f é menor do que o valor mínimo %.2f. " +
                    "Vamos atribuir o valor mínimo.%n", valorHoraProfessor, VALOR_MINIMO_HORA_AULA);
            valorHoraProfessor = VALOR_MINIMO_HORA_AULA;
        }

        while (valorHoraProfessor < VALOR_MINIMO_HORA_AULA) {
            System.out.printf("O valor hora mínimo é de %.2f. Insira um valor válido!!!%n", VALOR_MINIMO_HORA_AULA);
            valorHoraProfessor = Leitor.escanearValorHoraProfessor();
        }

        do {
            System.out.printf("O valor hora mínimo é de %.2f. Insira um valor válido!!!%n", VALOR_MINIMO_HORA_AULA);
            valorHoraProfessor = Leitor.escanearValorHoraProfessor();
        } while (valorHoraProfessor < VALOR_MINIMO_HORA_AULA);

        /**
        
            SWITCH CASE       
        
         */
        String nomeProfessor = "";
        Scanner scanOpcao = new Scanner(System.in);
        int opcao;
        String continuidade;

        do {
            System.out.println("Escolha a opção \n 1 - Cadastra \n 2 - Imprime");
            opcao = scanOpcao.nextInt();
            switch (opcao) {
                case 1:
                    nomeProfessor = Leitor.escanearNomeProfessor();
                    break;
                case 2:
                    if (nomeProfessor.isEmpty()) {
                        System.out.println("Não há um professor cadastrado");
                    } else {
                        System.out.println("Professor " + nomeProfessor);
                    }
                    break;
                default: 
                    System.out.println("Valor inválido, por favor digite uma opção válida.");
                    break;    
            }
            System.out.print("Operação realizada. Digite [S] para realiza uma nova operação. ");
            continuidade = scanOpcao.next();
        } while (continuidade.equalsIgnoreCase("S"));

        System.exit(0);
