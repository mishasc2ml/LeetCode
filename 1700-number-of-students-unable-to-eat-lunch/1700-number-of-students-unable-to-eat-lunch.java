class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int len = students.length; 
        Deque<Integer> studentsDeque = new ArrayDeque<>();
        Stack<Integer> sandwichStack = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            sandwichStack.push(sandwiches[len - i - 1]);
            studentsDeque.offer(students[i]);
        }
        int lastServed = 0;
        while (lastServed < studentsDeque.size()) {
            if (studentsDeque.peek() == sandwichStack.peek()) {
                sandwichStack.pop();
                studentsDeque.poll();
                lastServed = 0;
            } else {
                studentsDeque.addLast(studentsDeque.pollFirst());
                lastServed++;
            }
        }
        
        return studentsDeque.size();
    }
}