public class SmartTv{
    boolean ligada = false;
    int canal =1;
    int volume = 25; 

    // CRIAÇÃO DOS MÉTODOS 
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.err.println("Diminuindo: " + volume);
    }

    public void aumentarCanal(){
        canal ++; 
    }
    public void diminuirCanal(){
        canal --; 
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }


}