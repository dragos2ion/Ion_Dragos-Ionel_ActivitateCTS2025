public class Program {

	public static void main(String[] args) {
		AClient client1 = new Client();
		AClient client2 = new Client();
		AClient client3 = new Client();
		AClient client4 = new Client();
		AClient client5 = new Client();

		Float valoareNota = (float) 100;

		client1.achitaNota(valoareNota);
		client2.achitaNota(valoareNota);
		client3.achitaNota(valoareNota);
		client4.achitaNota(valoareNota);
		client5.achitaNota(valoareNota);

		AClient clientDecorat1 = new DecoratorClient(client1);
		AClient clientDecorat2 = new DecoratorClient(client2);
		AClient clientDecorat3 = new DecoratorClient(client3);
		AClient clientDecorat4 = new DecoratorClient(client4);
		AClient clientDecorat5 = new DecoratorClient(client5);

		clientDecorat1.achitaNota(valoareNota);
		clientDecorat2.achitaNota(valoareNota);
		clientDecorat3.achitaNota(valoareNota);
		clientDecorat4.achitaNota(valoareNota);
		clientDecorat5.achitaNota((float) 50);
		clientDecorat5.achitaNota(valoareNota);
	}

}
