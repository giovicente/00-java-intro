// Criar uma branch local a partir da main chamada feature/heranca-polimorfismo

// Criar classe
public class CarroPasseio extends Carro

// Criar construtor default na classe Carro

// Instanciar um carroZerado só para exemplificar

// Instanciar um Carro Passeio, mostrar que depois de dar o "." já aprecem coisas implementadas no Carro e fazer uns set's nele

// Depois tentar criar um CarroPasseio com os atributos definidos no construtor do Carro (igual o Diegod fez com o Corolla...)

// Quando der errado, entrar na classe CarroPasseio e fazer um construtor referenciando o construtor da superclasse

    boolean hasAirBag;

    public CarroPasseio(String marca, String modelo, int quantidadePortas, int quantidadeLugares, String tipoCombustao) {
        super(marca, modelo, quantidadePortas, quantidadeLugares, tipoCombustao);
    }

// Mostra que, a partir daí, deu certo instanciar um carro de passeio, mas aí eu falo que agora eu quero colocar o campo de air bag, e ele não deixa porque preciso criar um novo construtor com o polimorfismo de sobrecarga

// Depois, usando o polimorfismo de sobrecarga, cria um novo construtor com o air bag
    
    public CarroPasseio(String marca, String modelo,
                        int quantidadePortas, int quantidadeLugares, String tipoCombustao, boolean hasAirBag) {
        super(marca, modelo, quantidadePortas, quantidadeLugares, tipoCombustao);
        this.hasAirBag = hasAirBag;
    }

// Reescreve o toString() do carro de passeio usando o Alt + Insert, explicando que os campos da superclasse já estão sendo referenciados corretamente devido ao chamado do construtor via super()

// No main, abaixo do print de carro, printa o carro de passeio, explica que o carro de passeio já carrega tudo o que o Diegod explicou e implementou sobre o carro e comenta o ponto que herança só faz sentido se o contexto for o mesmo, e que para os demais casos é melhor realizar um relacionamento entre as classes (no caso da loja, não faz sentido ela ser um carro, e sim ter os carros... se ela herdar de carro vai carregar um monte de comportamento que não se aplica a ela e ainda por cima existe o risco dela ter comportamentos estranhos devido à alterações no carro)

// Depois, CRIAR A CLASSE CarroCorrida para explicar um pouco sobre polimorfismo

    public String acelerar() {
        this.velocidadeAtual = this.velocidadeAtual + 50;
        return "VRUUUUUUUMZÃO";
    }

//Main
    System.out.println("===== Aceleração Carro de Corrida =====");
    System.out.println("Antes de acelerar: " + carroCorrida.getVelocidadeAtual());
    String resultado = carroCorrida.acelerar();
    System.out.println(resultado + " Depois de acelerar: " + carroCorrida.getVelocidadeAtual());

    System.out.println("===== Aceleração Carro de Passeio =====");
    System.out.println("Antes de acelerar: " + carroPasseio.getVelocidadeAtual());
    resultado = carroPasseio.acelerar();
    System.out.println(resultado + " Depois de acelerar: " + carroPasseio.getVelocidadeAtual());

// Fazer uma instância de carro passeio a partir de um carro (comentar que isso é o polimorfismo na instanciação de objetos)

        Carro carroPasseio1 = new CarroPasseio("Toyota",
                "Ethios",
                5,
                5,
                TipoMotorEnum.COMBUSTAO.getDescricao(),
                true);

// Relacionar isso com a questão do List test = new ArrayList<>(); comentando que no caso de implementar isso em uma interface faz mais sentido dado que a interface só possui assinaturas de métodos

// Depois, atribuir o objeto carroPasseio1 a um objeto do tipo CarroPasseio (com cast) e mostrar que o ponto que o Diego mostrou na última aula ainda da realização de uma referência em memória ainda se aplica

// Fazer uma interface ICarros e uma implementação de acelerar() para ela em cada subclasse, dado que é melhor "obrigar" a implementação desse comportamento em cada uma das classes

// Explicar que tem só o assinatura do método e que esse método por default é público

// Comentar o método acelerar da classe Carro e colocar o implements nas classes, mostrar que como a assinatura não muda é um @Override

public abstract class Motocicleta {

    private String marca;
    private int cilindaradas;

    public Motocicleta(String marca, int cilindaradas) {
        this.marca = marca;
        this.cilindaradas = cilindaradas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindaradas() {
        return cilindaradas;
    }

    public void setCilindaradas(int cilindaradas) {
        this.cilindaradas = cilindaradas;
    }

    public abstract void cortarGiro();
}

// Tenta instanciar

public class MotocicletaEsportiva extends Motocicleta {


    public MotocicletaEsportiva(String marca, int cilindaradas) {
        super(marca, cilindaradas);
    }

    @Override
    public void cortarGiro() {
        System.out.println("Cortando giro");
    }
}

    MotocicletaEsportiva motocicletaEsportiva = new MotocicletaEsportiva("Honda", 500);
    motocicletaEsportiva.cortarGiro();


    Motocicleta motocicletaEsportiva = new MotocicletaEsportiva("Honda", 500);
    motocicletaEsportiva.cortarGiro();

// Fala de organizar pacotes por feature, pq aí eles veem os dois jeitos e não carregam vícios no Spring
// Por fim, fala de branch e pull request