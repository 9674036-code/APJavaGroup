// paul tokhtuev | queue example
using System.Collections.Generic;
 class Program
{
    static Queue<string> playerInput = new Queue<string>();
   

static int turnNumber = 1;

    static void Main(string[] args)
    {
        Console.WriteLine("Input amount of actions");
        
        GetInput();
    }

    static void GetInput() 
    {
        int amount = 0;
        if(Int32.TryParse(Console.ReadLine(), out amount ))
        {
            SetInput(amount);
        }else {
            GetInput();
        }
        
    }
    static  void SetInput(int amount)
    {
        try
        {
        for(int i = 0; i < amount; i++)
        {
            Console.WriteLine("action "+ (i+1));
            playerInput.Enqueue(Console.ReadLine());
        }
        } catch
        {
            SetInput(amount);
        }
        DisplayQueue();
    }
    static  void DisplayQueue()
    {
        if(playerInput.Count > 0)
        {

          

            Console.WriteLine("Current Input " +turnNumber+ " : " + playerInput.Peek());

             ResolveQueue();
        }
        else
        {
            return;
        }
    }
    static  void ResolveQueue()
    {
        playerInput.Dequeue();
        turnNumber++;
        DisplayQueue();
    }
}
// first in first out works for this program because we want the first input the player does to be the first inpute resolved. 
// If a second variable named secondPlayerInput was created and set equal to playerInput in this manner: Queue<string> secondPlayerInput = playerInput, it
// would make any changes to the either queue show up in both queues. They would be identicle. To prevent this from happening secondPlayerInput would need
// be a copy of playerInput. This can be done in the manner of: Queue<string> secondPlayerInput = new Queue<string>(playerInput);