"""
In the corresponding examples for the threading module, there is no effort to check for __main__. The child process
needs to be able to import the script containing the target function. Wrapping in a check for __main__ ensures that the
"main" part of the application is not run recursively in each child as the module (e.g., multiprocessing_simpleargs.py)
is imported.
The alternative is to simply import the target function from a different module.

Remember: if __name__ == '__main__' determines the execution context. This means that code can be enclosed in this
clause if we want to ensure that it runs when the script is called from the command line *but not* when the interpreter
merely imports the module.
Quoting from the official Python docs:
A module's __name__ is set equal to '__main__' when read from standard input, a script, or from an interactive prompt.
"""
import multiprocessing

from pymotw import multiprocessing_import_worker

if __name__ == '__main__':
    jobs = []
    for i in range(5):
        p = multiprocessing.Process(target=multiprocessing_import_worker.worker, args=(i,))
        jobs.append(p)
        p.start()
