# Git

* Ferramenta para realizar versionamento de arquivos, tipicamente utilizada para controle de versão de códigos fonte e até mesmo CI / CD de sistemas de código: https://git-scm.com/
    * Para saber mais dessa parte de Git enquanto ferramenta de deploy, recomendo fortemente acessar o canal LinuxTips no Youtube, é o canal de um brasileiro chamado Jeferson Fernando trabalhando / morando na Holanda, o legal é que ele costuma fazer os vídeos abrindo uma cerveja diferente e falando um pouco dela, deu até vontade de fazer algo parecido, mas com cervejas e também cafés que, de alguma forma, gostaria de relacionar com o assunto do vídeo

* Vou entrar aqui no meu github rapidinho para mostrar que o meu TCC da pós foi todo versionado no Git
    * Aproveitando, todos aqui sabem a diferença entre Git, Github e Gitlab? Basicamente Git é o sistema core de versionamento, enquanto o Github e Gitlab (tem também o Bitbucket e AWS Code Commit) funcionam como servidores para hospedar seus arquivos remotamente e permitir o acesso à esses arquivos (tanto por você quanto pela comunidade [contanto que o repo esteja público]), além de servirem como mecanismo de deploy (publicação nos ambientes): https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control

* Em outras palavras, parafraseando minha esposa, ele pode ser usado como um "Google Drive para nerds"

* Falando um pouquinho da história do Git, nós vimos que a ideia é fazer um controle de versionamento... mas já não haviam outras ferramentas de versionamento de código (https://git-scm.com/about/small-and-fast)? Sim, mas elas eram:
    * Complexas de manusear (até hoje, existem nas empresas a figura de gerente de configuração ou release management... num contexto de open source até faz sentido, mas num contexto enterprise isso pode até mesmo engessar os processos e atrasar os trabalhos em um projeto)
    * Lentas (Linus comentou que em uma thread de discussão típica dele, contendo uns 250 e-mails, levava 2 horas para subir) 
    * Não garantiam a integridade dos arquivos que iam para o servidor (por vezes, eles poderiam corromper), controle de versão feito arquivo a arquivo e não por snapshot
    * Fun fact: trabalhei com uma ferramenta muito boa de versionamento no mainframe chamada Changeman ZMF, e algumas em computação distribuída não tão boas assim, como IBM RTC e ClearQuest

* Diante disso, o famoso programador e criador do Linux Linus Torvalds criou essa ferramenta, buscando velocidade, integridade e um sistema distribuído: https://git-scm.com/about/branching-and-merging
    * Além das ferramentas de versionamento citadas, ele comenta sobre experiências traumáticas com o SVN (também conhecido como Subversion)

* Porquê ele tem esse nome? A gente pode dar uma olhada no commit inicial do Git: https://initialcommit.com/blog/How-Did-Git-Get-Its-Name. Segundo o próprio Linus, ele é um cara egocêntrico e que gosta de batizar suas criações com seu próprio nome, daí "git" é uma gíria britânica para "arrogante" ou, em outras palavras, "o cara que se acha a última bolacha do pacote"
    * Apesar que ele realmente está num patamar extremamente elevado de programadores, é como se fosse o elo "Radiante" no Valorant

* Instalação do Git (next, next, finish) e verificando se o mesmo está instalado via `git --help`

* Comandos básicos (Github Git cheat sheet): https://education.github.com/git-cheat-sheet-education.pdf

* Em tradução livre, "cheat sheet" significa "cola", ou seja, é a "colinha" que algumas pessoas fazem na prova. No nosso mundo de programação, o uso de cheat sheets é extremamente comum e saudável (tem até caneca vendida com cheat sheet de git, basta pesquisar por "caneca comandos Git"), o ponto é que seu uso precisa ser justamente, o de uma "colinha" para não precisar ficar revisitando materiais, aulas e estudos mais pesados. Porém, se você simplesmente digitar comandos, sem ter consciência do que está sendo feito de fato por detrás dos panos, você simplesmente está sendo adestrado e caso tenha uma nova ferramenta você vai ter que esperar alguém aprender ela, montar um cheat sheet e ficar refém dele de novo... 
    * A bem da verdade, para ferramentas de SCM este cenário é improvável, mas para linguagens / plataformas de cloud é super provável

* Comandos básicos (fazer o add, commit, push e pull no VS Code e IntelliJ também)
    * global config
    * Criando um repo do zero e seguindo a "receita de bolo" que vem no git, explicando cada item
        * Fazer o init
        * status
        * add
        * commit (usar commits semânticos: https://www.conventionalcommits.org/en/v1.0.0/#specification)
        * push
        * log (notem que quando aparece o histórico dos commits, aparece também o seu identificador único em um hash SHA-1) e `git log --oneline`
        * Criar a branch main
        * Fazer o remote add linkando as duas coisas (é legal explicar que, no Git, quando você usa somente um `-` o parâmetro tem somente uma letra e quando usa `--` o parâmetro tem uma palavra [legal compartilhar que isso foi notado por observação e por uso, mas que na documentação do Git, apesar de não ficar explícito, eles meio que orientam assim também])
        * Mostrar que atualizou o repo    
    * clone
    * para reverter alterações, use `git restore` para arquivos que não estão na stage area e `git restore --staged` para reverter alterações que já passaram por um `git add .`
    * e se eu já commitei e preciso reverter o commit? `git reset --hard <hash do commit que você quer apontar>`
    * se eu já fiz o push, dá para fazer o `git reset` e na sequência um git push `--force-with-lease`
    * agora vou fazer uma alteração remota no readme e depois fazer o pull (dúvida recorrente)
    * diff (temos também outras recomendações, como o Meld, visual studio code [basta alterar o arquivo e clicar no símbolo das "branches" ao lado do preview], IntelliJ [2 jeitos: botão direito no arquivo e depois ir em Git >> Show Diff ou então clicar na branch, acessar o repo que você quer, a branch deste repo e por fim selecionar "Show Diff with Working Tree"])
        * Se for digitado somente o `git diff`, vão ser referenciadas e apontadas as diferenças de todos os arquivos do projeto que já foram commitados pelo menos uma vez e que ainda não foram para a stage área (também conhecida como "cesta de commits"), ou seja, o `git add` ainda não foi realizado nestes arquivos. Para arquivos que já estão na stage area mas ainda não foram commitados, é possível usar o `git diff --staged`
        * Quando o diff é feito, o output é exibido no que acredito que seja um Vim (um editor de texto que roda no Linux... tem devs muito raiz [mas muito mesmo, do tipo que codam ouvindo rock progressivo e no tempo livro são moderadores de fórum de Rick and Morty no Reddit] são super entusiastas, usam mais que qualquer outra IDE), então tem que ficar batendo `enter` à medida que os `:` ainda aparecerem e no final utilizar os famosos `esc` + `:` + `q` de "quero sair"
        * Também é possível fazer a comparação de versões já commitadas no próprio github, clicando em History, ele tem as diferenças da versão selecionada em relação à versão anterior

* Branching e DAG
    * Branch vêm de ramificação, ou seja, será criado um ramo, ou "ambiente", separado para realização de alterações, uma vez que as alterações foram testadas e validadas, é submetido um pull request para a branch (ou "ambiente", desejado). É por isso que os git flows (que é este fluxo de você criar uma branch, depois juntar com outra branch) parecem mapas de metrô. Por trás, está sendo utilizada uma estrutura de dados conhecida como DAG (Direct Acyclic Graph: https://en.wikipedia.org/wiki/Directed_acyclic_graph)
        * É como se fosse um multiverso, com a diferença de que é possível unir as alterações de um ambiente para outro
    * Agora vou criar uma branch no IntelliJ, VS Code e no Terminal... simulando um ambiente de desenvolvimento segregado da main (antiga master)
        * Tipicamente, temos ambientes segregados (local / localhost, desenvolvimento, homologação e produção)... testes é um assunto crítico e uma disciplina inteira à parte, mas recomendo dar uma olhada no conceito de pirâmide de testes
        * Aqui temos os níveis de cada teste, de modo que podemos relacionar esses testes com as branchs (ou ambientes) correspondentes
            * Unit test -> local, pode ser feito utilizando a técnica do TDD (tem no Clean Code) ou não
                * Dica de um aprendizado "das ruas" para o longo prazo: quando vocês estiverem fazendo algum teste técnico para uma empresa (nível pleno ou sênior) ou até mesmo um freela, e a aplicação tiver muitas regras de negócio e um ambiente complexo, façam com TDD, pois muito provavelmente a criação de uma regra nova vai quebrar os testes de uma regra que já estava OK e aí você vai ajustando tudo (eu já fui tester, e essa experiência me ensinou a comemorar quando um defeito é detectado porque com isso temos uma oportunidade de corrigir o problema antes dele chegar no cliente [se nós descobrirmos o problema antes, quem vai descobrir é o cliente...])
            * Integration tests -> ambiente de desenvolvimento, verifica a integração entre Api's / Serviços entre eles e também com banco de dados, filas, tópicos, etc...
            * E2E (end to end) -> é a validação no ambiente de homologação (espelho de produção), integrando com a interface gráfica quando aplicável 
    * Para criar uma branch, utilizar o comando `git branch <branch-name>`
    * Para acessar uma branch, utilizar `git checkout <branch-name>`
    * Para criar uma branch e já entrar nela, usar o `git checkout -b <branch-name>`
    * Fazer o commit e o push para mostrar que a branch "apareceu" no github

* Exercício: criar sua branch e solicitar um pull request para a develop

* Recursos avançados
    * Reescrevendo commits com `git ammend` e `git rebase`: https://letscode.com.br/blog/como-escrever-commits-para-melhorar-a-integridade-de-sua-codebase
    * Realizar squash de commits
    * Restaurar versões de commits antigos: apresentar os comandos `git log --oneline`, `git log --graph`, `git log --oneline --graph`
        * Fazer um `git checkout <hash do commit>` para apontar para o commit desejado
        * `git checkout master` para voltar para o HEAD