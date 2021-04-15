package es.geospain.api.business.language;

/**
 * @author: guillem.casas
 * @version: 14/04/2021
 **/
public enum SupportedLanguages {

    cat(1),
    esp(2);

    private int value;

    SupportedLanguages(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
