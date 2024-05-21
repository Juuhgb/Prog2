public class Main {

    public static void main(String[] args){
        LeitorArquivo leitorarquivo = new LeitorArquivo();

        String str = leitorarquivo.lerArquivo("C:/Users/Juliana/IdeaProjects/DetectorSpam/src/termos.txt");

        System.out.println(Detector.calcularSpam(str));
    }
}