package register;

public class ErrEntity {
    private String errEmpty;
    private String errlength;
    private String errCha;
    private String errW;

    public ErrEntity(String errEmpty, String errlength, String errCha, String errW) {
        this.errEmpty = errEmpty;
        this.errlength = errlength;
        this.errCha = errCha;
        this.errW = errW;
    }

    public ErrEntity() {
    }

    public String getErrEmpty() {
        return errEmpty;
    }

    public void setErrEmpty(String errEmpty) {
        this.errEmpty = errEmpty;
    }

    public String getErrlength() {
        return errlength;
    }

    public void setErrlength(String errlength) {
        this.errlength = errlength;
    }

    public String getErrCha() {
        return errCha;
    }

    public void setErrCha(String errCha) {
        this.errCha = errCha;
    }

    public String getErrW() {
        return errW;
    }

    public void setErrW(String errW) {
        this.errW = errW;
    }
}
