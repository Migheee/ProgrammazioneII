/* ENUMS: tipi che rapprensentano un insieme finito di costanti, INTRODOTTI IN JAVA 5   
 * In alcuni contesti, è comodo avere dei tipi con dei valori predefiniti
 *
 * public enum Direction {
 *   NORTH, SOUTH, EAST, WEST
 * }
 *
 * In questo caso l'utilizzo di altri tipi primitivi per memorizzare lo stesso contenuto sarebbe molto più complesso (se non impossiible)
 *
 * Se si vuole dichiarare una variabile move di tipo Direction, essa può assumere solo uno dei seguenti 4 valori
 *
 * VANTAGGI:
 * 1. efficienza memoria e escuzione
 * 2. dal punto di vista logico, il codice è molto più semplice, consistente e pulito (quindi manuntenibile)
 *
 *
 * In realtà sono classi il cui costruttore non può essere invocato direttamente
 * Hanno rappresentazione numerica e sottoforma di stringa
 *
 * Direction move = Direction.WEST;
 * System.out.println(move.name()); ----> WEST (rappresentazione come stringa)
 * System.out.println(move.ordinal()); ----> 3 (rappresentazione numerica
 *
 * ENUM COMPARISON
 * Enums si assicura che nella JVM esista solo un'istanza condivisa di enum_name.enum_constant 
 * In questo caso si usa direttamente l'operatore ==
 *
 * System.out.println(move1 == Direction.WEST) ----> true
 * L'utilizzo di equals è consentito, ma genera eccezioni nel caso in cui una variabile non punta a nessuna istanza di enum
 *  
 *
 *  move2 = null;
 *  System.out.println(move.Equals(move2)); ----> JVM Exception
 *
 *  Si possono usare anche negli switch (JAVA 9)
 *
 *
 *  switch(move){
 *      case NORTH: return "↑";
 *      case SOUTH: return "↓";
 *      case EAST: return "->";
 *      case WEST: return "<-";
 *  }
 *
 *  Gli enum posso essere usati anche negli enhanced for loops
 *
 *  for(Direction d :  Direction.values) //Direction.value restitusce un array delle costanti
 *      System.out.println(d.name);
 *
 */
