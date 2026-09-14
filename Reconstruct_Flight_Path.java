import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Reconstruct_Flight_Path {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        for (List<String> ticket : tickets) {
            adj.computeIfAbsent(ticket.get(0),
            k -> new PriorityQueue<>()).add(ticket.get(1));
        }

        LinkedList<String> res = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");

        while (!stack.isEmpty()) {
            String curr = stack.peek();
            if (!adj.containsKey(curr) || adj.get(curr).isEmpty()) {
                res.addFirst(stack.pop());
            } else {
                stack.push(adj.get(curr).poll());
            }
        }

        return res;
    }
    
}