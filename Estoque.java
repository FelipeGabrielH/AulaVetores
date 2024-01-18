public class Estoque {
    private int quantidadeArrozComprada;
    private int quantidadePastaComprada;
    private int quantidadeBananaComprada;
    private int quantidadePasta;
    private int quantidadeArroz;
    private int quantidadeBanana;
    private double valorTotalDaCompra;
    private double valorPasta;
    private double valorArroz;
    private double valorBanana;

    public Estoque(){
        quantidadeArroz = 20;
        quantidadePasta = 72;
        quantidadeBanana = 55;

        quantidadeArrozComprada = 0;
        quantidadePastaComprada = 0;
        quantidadeBananaComprada =0 ;

        valorArroz = 11.90;
        valorPasta = 12.90;
        valorBanana = 34.99;

        valorTotalDaCompra = 0;

    }

    public int getQuantidadeArroz() {
        return quantidadeArroz;
    }
    public int getQuantidadePasta(){
        return quantidadePasta;
    }

    public int getQuantidadeBanana() {
        return quantidadeBanana;
    }

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public double getValorArroz() {
        return valorArroz;
    }

    public double getValorBanana() {
        return valorBanana;
    }

    public double getValorPasta() {
        return valorPasta;
    }

    public void setQuantidadeArroz(int quantidadeArroz) {
        this.quantidadeArroz = quantidadeArroz;
    }

    public void setQuantidadeBanana(int quantidadeBanana) {
        this.quantidadeBanana = quantidadeBanana;
    }

    public void setQuantidadePasta(int quantidadePasta) {
        this.quantidadePasta = quantidadePasta;
    }

    public double ValorCompra(){
        valorTotalDaCompra = (quantidadeArrozComprada * valorArroz) + (quantidadeBananaComprada * valorBanana) + (quantidadePastaComprada * valorPasta);

        if (quantidadeArrozComprada > quantidadeArroz){
            System.out.println("Não Possuimos Etoque de Arroz Suficiente");
        }else if (quantidadeBananaComprada > quantidadeBanana){
            System.out.println("Não Possuimos Etoque de Banana Suficiente");
        }else if (quantidadePastaComprada > quantidadePasta) {
            System.out.println("Não Possuimos Etoque de Pasta Suficiente");
        }
            return valorTotalDaCompra;

    }
    public void VerEstoque(){
       System.out.println ("Arroz :"+quantidadeArroz+ "\nPasta :"+quantidadePasta +"\nBanana :"+quantidadeBanana );
    }

    public void setQuantidadeArrozComprada(int quantidadeArrozComprada) {
        this.quantidadeArrozComprada = quantidadeArrozComprada;
    }

    public void setQuantidadePastaComprada(int quantidadePastaComprada) {
        this.quantidadePastaComprada = quantidadePastaComprada;
    }

    public void setQuantidadeBananaComprada(int quantidadeBananaComprada) {
        this.quantidadeBananaComprada = quantidadeBananaComprada;
    }
}
