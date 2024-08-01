public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.deminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(11);
        System.out.println("Canal Atual: " + smartTv.canal);
        
        
        System.out.println("Volume Atual: " + smartTv.volume);


        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Desligada? " + smartTv.ligada);

        // Caminho para gerar JavaDoc:
        //(base) brito@brito-POSITIVO-MOBILE:~/Área de Trabalho/BootcampClaro/bootcampClaro/bootcampClaro/java-anatomia-classes/sistema-smart-tv/src$ javadoc -d ./docs -sourcepath ./src Usuario.java
    }
}
