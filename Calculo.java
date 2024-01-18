public class Calculo {
    private float num1;
    private float num2;
    private float total;

    /** Método construtor */
    public Calculo(){
        num1 = 0;
        num2 = 0;
        total = 0;
    }
    /** Método contruido para retornar o valor do atributo "total". */
    public float getTotal(){
        return  total;
    }
    /** Método contruido para retornar o valor do atributo "num1". */
    public void setNum1(float v1){
        num1 = v1;
    }
    public void setNum2(float v1){
        num2 = v1;
    }
    /** Método construido para receber dois valores, efetuar um cálculo e
     * retornar o resultado sem usar os atributos da classe.
     * para v1
     * para v2
     * return (v1 * v2) /  (v1 + v2)
     */
    public float calculo01 (float v1, float v2){
        float res;
        res = (v1 * v2) / (v1 + v2);
        return (res);
    }
    /* Método construido para receber um cálculo com valores previamente
     * passados aos atributos "num1" e "num2" da classe e retornar oo valor
     * deste cálculo.
     * @return num1 - 3 * num2
     */
    public float calculo02(){
        total = num1 - 3 * num2;
        return total;
    }
    /* Método construido para efetuar um cálculo com valores
     * previamente passados aos atributos "num1" e "num2" da classe
     * O resultado do cálculo será armazenado no atributo "total"
     * e poderá ser obtido por meio da chamada ao método "getTotal".
     */
    public void calculo03(){
        total = (num1 - num2) / num2;
    }
}
