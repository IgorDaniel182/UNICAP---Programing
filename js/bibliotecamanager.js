// Array para armazenar os livros
const biblioteca = [];

// Função para exibir o menu principal
function exibirMenu() {
  console.log("Bem-vindo ao Sistema de Gerenciamento de Biblioteca!");
  console.log("Escolha uma opção:");
  console.log("1. Cadastrar Livro");
  console.log("2. Alterar Livro");
  console.log("3. Deletar Livro");
  console.log("4. Realizar Empréstimo de Livro");
  console.log("5. Devolver Livro");
  console.log("6. Sair");
}

// Função para cadastrar um livro
function cadastrarLivro() {
  const titulo = prompt("Digite o título do livro:");
  const autor = prompt("Digite o autor do livro:");
  const id = biblioteca.length + 1;
  const emprestado = false;
  biblioteca.push({ id, titulo, autor, emprestado });
  console.log("Livro cadastrado com sucesso!");
}

// Função para alterar um livro
function alterarLivro() {
  const id = Number(prompt("Digite o ID do livro que deseja alterar:"));
  const livro = biblioteca.find((livro) => livro.id === id);
  if (livro) {
    const novoTitulo = prompt("Novo título (ou pressione Enter para manter o mesmo):");
    const novoAutor = prompt("Novo autor (ou pressione Enter para manter o mesmo):");
    if (novoTitulo) {
      livro.titulo = novoTitulo;
    }
    if (novoAutor) {
      livro.autor = novoAutor;
    }
    console.log("Livro alterado com sucesso!");
  } else {
    console.log("Livro não encontrado.");
  }
}

// Função para deletar um livro
function deletarLivro() {
  const id = Number(prompt("Digite o ID do livro que deseja deletar:"));
  const index = biblioteca.findIndex((livro) => livro.id === id);
  if (index !== -1) {
    biblioteca.splice(index, 1);
    console.log("Livro deletado com sucesso!");
  } else {
    console.log("Livro não encontrado.");
  }
}

// Função para realizar empréstimo de um livro
function realizarEmprestimo() {
  const id = Number(prompt("Digite o ID do livro que deseja emprestar:"));
  const livro = biblioteca.find((livro) => livro.id === id);
  if (livro) {
    if (livro.emprestado) {
      console.log("Este livro já está emprestado.");
    } else {
      livro.emprestado = true;
      console.log("Livro emprestado com sucesso!");
    }
  } else {
    console.log("Livro não encontrado.");
  }
}

// Função para devolver um livro
function devolverLivro() {
  const id = Number(prompt("Digite o ID do livro que deseja devolver:"));
  const livro = biblioteca.find((livro) => livro.id === id);
  if (livro) {
    if (livro.emprestado) {
      livro.emprestado = false;
      console.log("Livro devolvido com sucesso!");
    } else {
      console.log("Este livro não está emprestado.");
    }
  } else {
    console.log("Livro não encontrado.");
  }
}

// Laço de repetição para exibir o menu e processar as opções
let opcao;
do {
  exibirMenu();
  opcao = Number(prompt("Escolha uma opção:"));

  switch (opcao) {
    case 1:
      cadastrarLivro();
      break;
    case 2:
      alterarLivro();
      break;
    case 3:
      deletarLivro();
      break;
    case 4:
      realizarEmprestimo();
      break;
    case 5:
      devolverLivro();
      break;
    case 6:
      console.log("Saindo do sistema. Até logo!");
      break;
    default:
      console.log("Opção inválida. Tente novamente.");
  }
} while (opcao !== 6);
