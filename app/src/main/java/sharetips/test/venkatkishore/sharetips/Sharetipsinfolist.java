package sharetips.test.venkatkishore.sharetips;

/**
 * Created by venkat kishore on 23-05-2017.
 */

public class Sharetipsinfolist {

    private String script,entrytime,exittime, longshort, entryprice, exitprice,gainloss;

    public Sharetipsinfolist() {
    }

    public Sharetipsinfolist(String script, String entrytime, String exittime, String longshort, String entryprice, String exitprice, String gainloss) {
        this.script = script;
        this.entrytime = entrytime;
        this.exittime = exittime;
        this.longshort = longshort;
        this.entryprice = entryprice;
        this.exitprice = exitprice;
        this.gainloss = gainloss;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }

    public String getLongshort() {
        return longshort;
    }

    public void setLongshort(String longshort) {
        this.longshort = longshort;
    }

    public String getEntryprice() {
        return entryprice;
    }

    public void setEntryprice(String entryprice) {
        this.entryprice = entryprice;
    }

    public String getExitprice() {
        return exitprice;
    }

    public void setExitprice(String exitprice) {
        this.exitprice = exitprice;
    }

    public String getGainloss() {
        return gainloss;
    }

    public void setGainloss(String gainloss) {
        this.gainloss = gainloss;
    }
}
