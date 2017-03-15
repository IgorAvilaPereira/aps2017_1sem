package negocio;

/**
 *
 * @author iapereira
 */
public class SQLBuilder {
    public String sql;
    
    public SQLBuilder(){
        this.sql = "";
    }
    
    public SQLBuilder ilike(String coluna , String parametro){
        this.sql += coluna + " ILIKE "+parametro + " AND ";   
        return this;
    }
    
    // or
    
    // distinct
    
    public String gerarSQL(){
        return this.sql + " TRUE";
    }
    
    
    
}
