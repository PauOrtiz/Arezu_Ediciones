@FunctionalInterface
public interface Funcional {
    public String saludo(String sl);
    public default String saludame(){
        return "Duración:340 hrs";
  }
}
