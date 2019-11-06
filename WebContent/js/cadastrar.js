
var nome = document.getElementById('inputNome')
var cpf = document.getElementById('inputCpf')

function cadastrar(){
   if (nome == "" || nome == null || nome.value.length <=6){
       alert("Verifique se seu nome foi digitado ou tem menos que 7 letras.")
   }else{
       var conf = window.confirm('Clique em ok para finalizar o cadastro com sucesso.');

       if(conf == true) {
           alert('Parabéns ' + nome.value + ' Seu cadastro foi realizado com Sucesso.');
       }else{
           alert('Cadastro não realizado.');
       }
   }

}



