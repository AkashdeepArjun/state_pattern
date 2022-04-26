package home;

public class TestSp {
    public static void main(String[] args){
        MusicContext context=new MusicContext();
        MusicStartState start_state=new MusicStartState();
        MusicStopState stop_state=new MusicStopState();

        context.setState(start_state);
        context.doAction();

        context.setState(stop_state);
        context.doAction();


    }
    
}
