import v4_threadsafe.AgentieThreadSafe;

public class Main {

    public static void main(String[] args) {
        AgentieThreadSafe primaAgentie=AgentieThreadSafe.getInstanta("AgeTur", 1000, 10);
        AgentieThreadSafe aDouaAgentie=AgentieThreadSafe.getInstanta("O alta agentie", 10, 2);

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
    }
}