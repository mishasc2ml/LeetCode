class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int len = students.length; // Sandwiches will be the same length
        Deque<Integer> studentsDeque = new ArrayDeque<>();
        Stack<Integer> sandwichStack = new Stack<>();
        
        // Add students and sandwiches to the queue and stack
        for (int i = 0; i < len; i++) {
            sandwichStack.push(sandwiches[len - i - 1]);
            studentsDeque.offer(students[i]);
        }
        System.out.println(studentsDeque);
        System.out.println(sandwichStack);
        int lastServed = 0;
        while (lastServed < studentsDeque.size()) {
            Integer first = studentsDeque.pollFirst();
            if (first == sandwichStack.peek()) {
                sandwichStack.pop();
                lastServed = 0;
            } else {
                studentsDeque.addLast(first);
                lastServed++;
            }
        }
        System.out.println(studentsDeque);
        return studentsDeque.size();
    }
}