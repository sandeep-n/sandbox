from math import sqrt

import numpy as np
from operation import measure
from state import Qubit


def test_normalize():
    q = Qubit(1.0, 1.0j)  # |0> + i|1>
    assert np.isclose(q.v, np.array([[1/sqrt(2)], [1j/sqrt(2)]])).all()


def test_measure():
    zero = Qubit(1.0, 0.0)  # |0>
    one = Qubit(0.0, 1.0)  # |1>
    plus = Qubit(1.0, 1.0)  # |+>
    minus = Qubit(1.0, -1.0)  # |->

    assert measure(zero) == 0
    assert measure(one) == 1
    assert measure(plus) in {0, 1}
    assert measure(minus) in {0, 1}


def test_density_matrix():
    cases = [  # pairs (state vector, expected density matrix)
        (
            Qubit(1.0, 0.0),  # |0>
            np.array([   # |0><0|
                [1.0, 0.0],
                [0.0, 0.0]
            ])
        ),
        (
            Qubit(0.0, 1.0),  # |1>
            np.array([  # |1><1|
                [0.0, 0.0],
                [0.0, 1.0]
            ])
        ),
        (
            Qubit(1.0, 1.0),  # |+>
            np.array([  # |+><+|
                [1.0, 1.0],
                [1.0, 1.0]
            ]) * 0.5
        ),
        (
            Qubit(1.0, -1.0),  # |->
            np.array([  # |-><-|
                [1.0, -1.0],
                [-1.0, 1.0]
            ]) * 0.5
        )
    ]

    for psi, rho in cases:
        assert np.isclose(psi.density_matrix, rho).all()
