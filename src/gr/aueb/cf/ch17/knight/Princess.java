package gr.aueb.cf.ch17.knight;

import gr.aueb.cf.ch17.IDecision;
import gr.aueb.cf.ch17.IPrincess;

public class Princess implements IPrincess {
    @Override
    public void makeYourDecision(IDecision decision) {
        decision.kiss();
    }
}
