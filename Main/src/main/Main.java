/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Daniel Reguera Bazan
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /**
     * @RunWith(value=Parameterized.class)
//@RunWith(Parameterized.class)
  public class MontoParametroTest {
  private int a;
  private String resultado;
  
  public MontoParametroTest(int a, String resultado) {
    this.a = a;
    this.resultado = resultado;
  }
  * 
  * @Parameters
  public static Iterable<Object[]> getData() {
      List<Object[]> obj = new ArrayList<>();
      //objetos de preubas de equivalencia
      obj.add(new Object[] {333,"Valor introducido correcto"});
      obj.add(new Object[] {-4444,"Error: La cantidad introducida es menor de 1"});
      
      return obj;
  }
  * 
  * @Test
  public void testAdd(){
    System.out.println("ingreso");
    int cantidad = a;
    Monto instance = new Monto();
    String expResult = resultado;
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result); 
  }
     */
  }
  
  /**
   * 
   * private static Monto instance;
   * 
   * @Before
  public void Before() {
    System.out.println("Before");
    instance = new Monto();
  }
  
  @After
  public void After() {
    System.out.println("After");
    instance = null;
  }
  
  //Prueva de quivalencia1
    //Pasar valor valido 333
  @Test
  public void quivalencia1() {
    System.out.println("Cantidad: 333");
    int cantidad = 333;
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
   */
  
  
  /**
   * 
   * private static Monto instance;
  
  public MontoABClass() {
  }
  
  
  
  @BeforeClass
  public static void BeforeClass() {
    System.out.println("@BeforeClass -> BeforeClass");
    instance = new Monto();
  }
  
  @AfterClass
  public static void AfterClass() {
    System.out.println("@AfterClass -> AfterClass");
    //instance = null;
    //No hará falta: el programa se limpiará solo al terminar
  }
  
  
    //Prueva de quivalencia1
    //Pasar valor valido 333
  @Test
  public void quivalencia1() {
    System.out.println("Cantidad: 333");
    int cantidad = 333;
    String expResult = "Valor introducido correcto";
    String result = instance.ingreso(cantidad);
    assertEquals(expResult, result);
  }
   */
}
