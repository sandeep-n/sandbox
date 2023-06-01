import random

import numpy as np

from state import Qubit


def measure(qubit: Qubit) -> int:
    result = random.choices(population=(0, 1), weights=abs(qubit.v))[0]
    return result


X = np.array(
    [
        [0.0, 1.0],
        [1.0, 0.0]
    ]
)
Y = np.array(
    [
        [0.0, -1.0j],
        [1.0j, 0.0]
    ]
)
Z = np.array(
    [
        [1.0, 0.0],
        [0.0, -1.0]
    ]
)
I = np.array(
    [
        [1.0, 0.0],
        [0.0, 1.0]
    ]
)
