package pack1;

class A
{
    public static void main(String[] args)
    {
        System.out.println("done " + args);
    }

}

//command line arguments
//if you are printing the reference, you will get object's memory location like classname@hashcode in the form of hexadecimal
//At the time of running a program, we can pass some arguments to the program, that is what we can call command line arguments.
//While running a program even JVM also supplies a default empty String array object as an argument to the main method of a class.
//We can supply some command line arguments and that would be converted into String object.