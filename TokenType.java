package projectcompi2;

import java.util.List;
import java.util.ArrayList;

public class TokenType {
    
    private List<String> tokenTypeSymbols;
    private List<String> tokenTypeReservedWords;
    
    private static TokenType instance = null;
    
    protected TokenType(){
        this.tokenTypeSymbols = new ArrayList<String>();
        
        this.tokenTypeSymbols.add("CODE_START");
        this.tokenTypeSymbols.add("CODE_FINISH");
        this.tokenTypeSymbols.add("PRODUCE");
        this.tokenTypeSymbols.add("END_LINE");
        this.tokenTypeSymbols.add("ALSO_PRODUCE");
        this.tokenTypeSymbols.add("EQUAL");
        this.tokenTypeSymbols.add("SEPARATOR");
        this.tokenTypeSymbols.add("PERIOD");
        this.tokenTypeSymbols.add("ID");
        this.tokenTypeSymbols.add("DATA_TYPE");
        this.tokenTypeSymbols.add("RAW_CODE");
        
        this.tokenTypeReservedWords = new ArrayList<String>();
        
        this.tokenTypeReservedWords.add("parser");
        this.tokenTypeReservedWords.add("code");
        this.tokenTypeReservedWords.add("terminal");
        this.tokenTypeReservedWords.add("non");
    }
    
    public static TokenType getInstance(){
        if(instance == null)
            instance = new TokenType();
        
        return instance;
    }
    
    public boolean existSymbol(String symbol){
        return this.tokenTypeSymbols.contains(symbol);
    }
    
    public int getIndexOfSymbol(String symbol){
        return this.tokenTypeSymbols.indexOf(symbol);
    }
    
    public boolean existReservedWord(String reservedWord){
        return this.tokenTypeReservedWords.contains(reservedWord);
    }
    
    public int getIndexOfReservedWord(String reservedWord){
        return this.tokenTypeReservedWords.indexOf(reservedWord);
    }
    
}
