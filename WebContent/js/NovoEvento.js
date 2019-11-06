var contador = 1;
        var table = document.querySelector('table');
        var nome = document.querySelector('#nome');
        var descricao = document.querySelector('#descricao');
        var data = document.querySelector('#data');
        var valor = document.querySelector('#valor');
        var capacidade = document.querySelector('#capacidade');
        var i = 1;
        
        function adicionar(){
            var i = 1;
            table.innerHTML += "<tr><td>"+i+"</td><td>"+nome.value+"</td><td>"+descricao.value+"</td><td>"+data.value+"</td><td>"+valor.value+"</td><td>"+capacidade.value+"</td></tr>";
            i++;
        }