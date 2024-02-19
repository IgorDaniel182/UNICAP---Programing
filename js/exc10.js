function isQuadradoMagico(matriz) {
    const n = matriz.length;
  
    const somaReferencia = matriz[0].reduce((acc, num) => acc + num, 0);
  
    for (let i = 0; i < n; i++) {
      const somaLinha = matriz[i].reduce((acc, num) => acc + num, 0);
      if (somaLinha !== somaReferencia) {
        return false;
      }
    }
  
    for (let j = 0; j < n; j++) {
      const somaColuna = matriz.reduce((acc, linha) => acc + linha[j], 0);
      if (somaColuna !== somaReferencia) {
        return false;
      }
    }
  
    const somaDiagonalPrincipal = matriz.reduce((acc, linha, i) => acc + linha[i], 0);
    if (somaDiagonalPrincipal !== somaReferencia) {
      return false;
    }
  
    const somaDiagonalSecundaria = matriz.reduce((acc, linha, i) => acc + linha[n - i - 1], 0);
    if (somaDiagonalSecundaria !== somaReferencia) {
      return false;
    }
  
    return true;
  }

  const matrizExemplo = [
    [2, 7, 6],
    [9, 5, 1],
    [4, 3, 8]
  ];
  
  const resultado = isQuadradoMagico(matrizExemplo);
  if (resultado) {
    console.log("A matriz é um Quadrado Mágico.");
  } else {
    console.log("A matriz não é um Quadrado Mágico.");
  }
  