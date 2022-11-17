let matrizA=[[2,5,6],
            [5,9,7],
            [6,4,3]
            ];
let matrizB=[[5,3,2],
            [8,5,4],
            [1,4,9]
            ];
let matrizC=[
            [,,],
            [,,],
            [,,]
            ];
        for (let i = 0; i <matrizA.length; i++)	 {	
            for (let a = 0; a < 3; a++){	
             matrizC[i][a]=(matrizA[i][a])*(matrizB[a][i]);
            }  }  
            console.log(matrizC);
        



        