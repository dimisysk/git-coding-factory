package gr.aueb.cf.ch17.knight;

public class Princess implements IPrincess {
    @Override
    public void makeYourDecision(IDecision decision) {
        decision.kiss();
    }
}
