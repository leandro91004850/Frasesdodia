package br.com.leandro.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
            String[] frases= {
                    "I live in brasília	\neu moro em brasília	\n\n",
                    "I am very late	\neu estou muito atrasado	\n\n",
                    "i am laughing	\neu estou rindo	\n\n",
                    "i am bored	\neu estou entediado	\n\n",
                    "the first song	\no primero som	\n\n",
                    "open the door.	\nabrir a porta	\n\n",
                    "anything else 	\nalgo mais	\n\n",
                    "that´s nice	\nisto é bom	\n\n",
                    "here you are!	\naqui esta!	\n\n",
                    "see you tomorrow	\nate amanhã	\n\n",
                    "see you later	\nate mais	\n\n",
                    "over there	\nbem ali	\n\n",
                    "Bill has still not arrived.	\nBill ainda não chegou.	\n\n",
                    "good weekend!	\nbom final de semana	\n\n",
                    "sucks lollipop	\nchupa pirulito	\n\n",
                    "coworkers	\ncolégas de trabalho	\n\n",
                    "how often do you go out?	\ncom que frequencia você sai?	\n\n",
                    "How are you?	\ncomo você está?	\n\n",
                    "how do you say this word?	\ncomo se fala está palavra?	\n\n",
                    "let´me see	\ndeixa eu ver	\n\n",
                    "turn off	\ndeligar	\n\n",
                    "days of the week.	\ndias da semana.	\n\n",
                    "it is christmas	\né natal	\n\n",
                    "he scratches his tummy	\nele coça a barriga	\n\n",
                    "she runs around	\n	ela corre ao redor	\n\n",
                    "she runs around	\n	ela corre ao redor	\n\n",
                    "Did she tell you that?	\n	Ela lhe disse isso?	\n\n",
                    "she is okay now	\n	ela esta bem agora	\n\n",
                    "she can´t dance.	\n	ela não pode dança	\n\n",
                    "she doesn´t work every day.	\n	ela não trabalhar todos os dias	\n\n",
                    "she looks friendly	\n	ela parece amigável 	\n\n",
                    "she picked up a paper towel	\n	ela pegou um papel toalha	\n\n",
                    "she thinks he is lazy	\n	ela pensa que ele é preguiçoso	\n\n",
                    "she sits in the car	\n	ela senta no carro	\n\n",
                    "does she works every day ?	\n	ela trabalhar todos os dias?	\n\n",
                    "she works every day.	\n	ela trabalhar todos os dias.	\n\n",
                    "she goes to the nurse	\n	ela vai a enfermaria 	\n\n",
                    "does she goes to the club?	\n	 ela vai para o clube? 	\n\n",
                    "She has been studying	\n	Ela tem estudado 	\n\n",
                    "he starts doing his chores	\n	ele começa a fazer suas tarefas	\n\n",
                    "He danced a lot yesterday. 	\n	Ele dançou bastante ontem.	\n\n",
                    "He was younger 	\n	ele era mais jovem	\n\n",
                    "He has been studying	\n	Ele tem estudado 	\n\n",
                    "he can dance.	\n	ele pode dança.	\n\n",
                    "he takes a nap	\n	ele tira um cochilo	\n\n",
                    "come in.	\n	entrar	\n\n",
                    "each other	\n	entre si	\n\n",
                    "grow old together	\n	envelhecer juntos	\n\n",
                    "choose wisely	\n	escolha sabiamente	\n\n",
                    " Was it raining yesterday?	\n	estava chovendo ontem?	\n\n",
                    "it´s raining	\n	esta chovendo	\n\n",
                    "is this your camera?	\n	está é sua câmera?	\n\n",
                    "it is a historical date	\n	é uma data historica	\n\n",
                    "seasons of the year.	\n	estações do ano	\n\n",
                    "It was new in 2003.	\n	ele era novo em 2003	\n\n",
                    "this is the bedroom.	\n	este é o quarto.	\n\n",
                    "is this your e-mail address?	\n	é este seu endereço de e-mail?	\n\n",
                    "this is  my fingers	\n	estes são meus dedos	\n\n",
                    "i love my hasband	\n	eu amo meu marido	\n\n",
                    "i sometimes go swimming.	\n	eu as vezes vou a natação.	\n\n",
                    "I saw a movie yesterday	\n	eu vi um filme ontem	\n\n",
                    "i watch two video a day	\n	eu assisto dois video por dia	\n\n",
                    "i forgot.	\n	eu esquecir.	\n\n",
                    "I was tired 	\n	eu estava cansado	\n\n",
                    "I was at home last night	\n	Eu estava em casa ontem à noite	\n\n",
                    "i am just looking, thank you.	\n	eu estou apenas olhando, obrigado.	\n\n",
                    "i am bored	\n	eu estou entediado	\n\n",
                    "i am playing video game 	\n	eu estou jogando video game	\n\n",
                    "i am very pleased	\n	eu estou muito satisfeito	\n\n",
                    "I am very late.	\n	estou muito atrasado.	\n\n",
                    "i am laughing	\n	eu estou rindo 	\n\n",
                    "I studied Spanish last year.	\n	Eu estudei espanhol ano passado	\n\n",
                    "i live in brasília.	\n	eu moro em brasília.	\n\n",
                    "I didn’t watch TV last night.	\n	Não vi televisão ontem a noite.	\n\n",
                    "i do not/ don´t undertand.	\n	eu não entendo	\n\n",
                    "I am not working right now	\n	Não estou trabalhando no momento.	\n\n",
                    "i´m not wearing suit.	\n	eu não estou usando terno.	\n\n",
                    "i don´t live in brasília.	\neu não moro em brasília.	\n\n",
                    "i can´t dance.	\n	eu não posso dança.	\n\n",
                    "i don´t know	\n	eu não sei	\n\n",
                    "i don´t have umbrella	\neu não tenho guarda chuva	\n\n",
                    "i born in 1996	\n	eu nasci em 1996.	\n\n",
                    "can i eat now?	\n	eu posso comer agora?	\n\n",
                    "i can eat now.	\n	eu posso comer agora.	\n\n",
                    "i can make it	\n	eu posso fazer isto 	\n\n",
                    "i really need your help.	\n	preciso muito de sua ajuda.	\n\n",
                    "i want to go out now.	\n	eu quero sair agora.	\n\n",
                    "i have five potatoes	\n	eu tenho 5 batatas	\n\n",
                    "i tried.	\n	eu tentei	\n\n",
                    "I worked last night	\n	Eu trabalhei ontem a noite.	\n\n",
                    "i work at EMBRATUR.	\n	eu trabalhor na EMBRATUR.	\n\n",
                    "I have been studying	\n	Eu tenho estudado 	\n\n",
                    "I will help him later	\n	Eu vou ajudá-lo depois.	\n\n",
                    "i go to the club	\n	eu vou ao club	\n\n",
                    "I will be watching TV tonight	\n	Eu vou assistir TV hoje à noite.	\n\n",
                    "i go out with my friend	\n	eu sai com meus amigos	\n\n",
                    "i go out with my friends	\n	eu saio com meus amigos	\n\n",
                    "i will come back	\n	eu vou voltar	\n\n",
                    "it's on main street.	\n	é na rua principal.	\n\n",
                    "sentences with car	\n	frases com carros	\n\n",
                    "jill goes to the corner	\n	jill vai para o canto	\n\n",
                    "Articles read:	\n	ler o artigo	\n\n",
                    "mom gets bad	\n	mãe estava brava	\n\n",
                    "my wife left me	\n	minha mulher me deixou-me	\n\n",
                    "Nancy said to her father	\n	nancy disse a seu pai.	\n\n",
                    "no, it isn´t. run!	\n	não, ele não é, correr!	\n\n",
                    "no, i can´t sing.	\n	não, eu não posso canta.	\n\n",
                    "no, he can´t dance.	\n	não, ele não pode dança.	\n\n",
                    "no, i´m not tired.	\n	não, eu não estou cansado	\n\n",
                    "no, it isn´t, that is my car.	\n	não, aquele é meu carro.	\n\n",
                    "no,we have no, excuse.	\n	não, temos mais, desculpe.	\n\n",
                    "Last year, I traveled to Japan	\n	ano passado, eu viajei para o japão	\n\n",
                    "We have been studying	\n	Nós temos estudado 	\n\n",
                    "we wiil not tire	\n	nós não nos cansaremos 	\n\n",
                    "we have no, excuse.	\n	não, temos mais, desculpe.	\n\n",
                    "we need some milk	\n	precisamos de um pouco de leite	\n\n",
                    "do we have any milk?	\n	nós temos leite?	\n\n",
                    "the bank is on the corner	\n	0 banco fica na esquina.	\n\n",
                    "the car makes noises	\n	o carro faz barulho	\n\n",
                    "The film begins at 9 tonight. 	\n	O filme começa às 9 hoje a noite	\n\n",
                    "the cat is bored	\n	o gato esta entediado	\n\n",
                    "the bus is late	\n	o onibus esta atrasado	\n\n",
                    "what´s she wearing?	\n	o que ela está usando?	\n\n",
                    "what does that mean?	\n	o que isso significa?	\n\n",
                    "what else is she  wearing?	\n	o que mais ela esta usando?	\n\n",
                    "what else are you wearing?	\n	o que mais você está usando?	\n\n",
                    "what else are you wearing?	\n	o que mais você está usando?	\n\n",
                    "what have we here ?	\n	o que temos aqui	\n\n",
                    "what mean	\n	o que significa	\n\n",
                    "what´s in your room?	\n	o que esta dentro de seu quarto?	\n\n",
                    "what´s in your bag?	\n	o que está em sua bolsa?	\n\n",
                    "What are you drinking?	\n	O que você está bebendo? 	\n\n",
                    "what are you doing?	\n	o que você está fazendo?	\n\n",
                    "the last of us 	\n	o último de nós	\n\n",
                    "hello, how can i help you?	\n	ola, como posso ajuda-lo?	\n\n",
                    "where does she live?	\n	onde ela mora	\n\n",
                    "what are they?	\n	o que eles são?	\n\n",
                    "where are you?	\n	onde você esta?	\n\n",
                    "where can i buy shoes?	\n	onde posso comprar sapatos ?	\n\n",
                    "where is that place?	\n	onde é este lugar?	\n\n",
                    "where is it?	\n	onde esta isto?	\n\n",
                    "where´s the bathroom?	\n	onde fica o banheiro?	\n\n",
                    "where is the post office ?	\n	onde fica o correios?	\n\n",
                    "where is the park?	\n	onde ficar o park?	\n\n",
                    "where are you from?	\n	de onde você é?	\n\n",
                    "where were you yesterday?	\n	onde vc estava ontém?	\n\n",
                    "where do you live?	\n	onde você viver?	\n\n",
                    "where do you work?	\n	onde você trabalhar?	\n\n",
                    "dad gives tim a toy	\n	seu pai da a tim um brinquedo	\n\n",
                    "Why is she crying?	\n	Por que ela está chorando?	\n\n",
                    "what´s your favorite food?	\n	qual a sua comida favorita?	\n\n",
                    "what´s your sign?	\n	qual o seu signo?	\n\n",
                    "what´s your hometown?	\n	qual a sua cidade natal?	\n\n",
                    "when´s your hirthday?	\n	quando é seu aniversário?	\n\n",
                    " when she arrived?	\n	 quando ela chegou?	\n\n",
                    "how time is it?	\n	que/quantas horas são?	\n\n",
                    "how much?	\n	quanto custa?	\n\n",
                    "how much is that one?	\n	quanto é  aquele ali?	\n\n",
                    "how much is it?	\n	quanto é isto/isso?	\n\n",
                    "how old are you?	\n	quantos anos você tem?	\n\n",
                    "leandro´s restaurant	\n	restaurante do leandro	\n\n",
                    "go out.	\n	sair	\n\n",
                    "his name is leandro.	\n	O  seu nome  é leandro.	\n\n",
                    "her dad come home	\n	seu pai chega em casa	\n\n",
                    "her dad turns in the radio	\n	o pai dela liga o radio	\n\n",
                    "yes, i´m  tired.	\n	sim eu estou cansado	\n\n",
                    "yes, i can play the piano.	\n	sim, eu posso tocar piano.	\n\n",
                    "yes, this is my camera.	\n	sim, está é minha câmera.	\n\n",
                    "yes ,there is. Why?	\n	sim, há porque?	\n\n",
                    "Maybe I'm not rich enough.	\n	talvez eu não sou rico o suficiente	\n\n",
                    "see you tomorrow	\n	ate amanhã	\n\n",
                    "see you soon!	\n	te vejo em breve!	\n\n",
                    "see you next week.	\n	te vejo na próxima semana.	\n\n",
                    "it taste good	\n	tem um gosto bom	\n\n",
                    "chritmas times	\n	tempo de natal	\n\n",
                    "try again	\n	tente novamente	\n\n",
                    "tim takes off the lid	\n	tim tira a tampa	\n\n",
                    "let´s go to the beach	\n	vamos à praia	\n\n",
                    "let´s go camping 	\n	vamos ao acampamento	\n\n",
                    "do you tired?	\n	você esta cansado?	\n\n",
                    "are you busy now?	\n	você esta ocupado agora?	\n\n",
                    "Did you call Debbie?	\n	ligou para debie?	\n\n",
                    "do you live in brasília?	\n	você mora/vive em brasília?	\n\n",
                    "do you ever play soccer?	\n	vc nunca joga futeboll	\n\n",
                    "you've never read a book	\n	você nunca leu  o um livro 	\n\n",
                    "can you repeat that?	\n	pode repetir isso?	\n\n",
                    "can you play the piano?	\n	você pode toca piano?	\n\n",
                    "do you want a snack?	\n	vc que um lanche?	\n\n",
                    "do you have any others?	\n	você tem outros?	\n\n",
                    "Will you make dinner?	\n	você vai fazer o jantar?	\n\n",
                    "do you change the oil?	\n	quantas vezes voce troca o oleo	\n\n",
                    "did you see that?	\n	você viu isto?	\n\n",
                    "can you sing?	\n	você pode cantar?	\n\n",
                    "at the same school	\n	na mesma escola	\n\n",
                    "but be careful	\n	mas tenha cuidado	\n\n",
                    "but it still looks good	\n	mais parece ser bom	\n\n",
                    "can i borrow $5?	\n	pode me emprestar 5 dolares?	\n\n",
                    "check back often	\n	volte sempre	\n\n",
                    "Did he live here?	\n	Será que ele morou aqui? 	\n\n",
                    "Do you feel the same	\n	vc sente o mesmo	\n\n",
                    "do you take good care of it?	\n	voce cuida bem dele	\n\n"
            };

            int numero = new Random().nextInt(frases.length);// baseado no números iremos pega uma frase
                TextView texto = (TextView) findViewById(R.id.text_resultado);
                texto.setText(frases[numero]);
    }
}
