public class EvaluateReversePolishNotation {
    String val;
    EvaluateReversePolishNotation next;
    EvaluateReversePolishNotation prev;

    EvaluateReversePolishNotation(String val, EvaluateReversePolishNotation next, EvaluateReversePolishNotation prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

 class Solution {
    public int evalRPN(String[] tokens) {
        EvaluateReversePolishNotation head = new EvaluateReversePolishNotation(tokens[0], null, null);
        EvaluateReversePolishNotation curr = head;

        for (int i = 1; i < tokens.length; i++) {
            curr.next = new EvaluateReversePolishNotation(tokens[i], null, curr);
            curr = curr.next;
        }

        int ans = 0;
        while (head != null) {
            if ("+-*/".contains(head.val)) {
                int l = Integer.parseInt(head.prev.prev.val);
                int r = Integer.parseInt(head.prev.val);
                int res = 0;
                if (head.val.equals("+")) {
                    res = l + r;
                } else if (head.val.equals("-")) {
                    res = l - r;
                } else if (head.val.equals("*")) {
                    res = l * r;
                } else {
                    res = l / r;
                }

                head.val = String.valueOf(res);
                head.prev = head.prev.prev.prev;
                if (head.prev != null) {
                    head.prev.next = head;
                }
            }

            ans = Integer.parseInt(head.val);
            head = head.next;
        }

        return ans;
    }
}

    

