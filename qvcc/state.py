from dataclasses import dataclass, field, InitVar
from typing import List

import numpy as np


@dataclass
class Qubit:
    """
    a |0> + b |1>
    """
    a: InitVar[complex]
    b: InitVar[complex]
    v: np.array = field(init=False)

    def __post_init__(self, a, b):
        self.v = self.normalize(np.array([[a], [b]]))

    @staticmethod
    def normalize(v):
        return v / np.linalg.norm(v)

    @property
    def density_matrix(self):
        v_dagger = np.array(np.asmatrix(self.v).getH())
        return self.v @ v_dagger


def mixed_state(pure_states: List[Qubit], probs: List[float]) -> np.array:
    """
    Construct a density matrix representation of a mixed state.
    The mixed state density matrix is a convex combination of the pure states' density matrices, wherein the
    coefficients are the supplied probabilities `probs`.
    :param pure_states: pure states of uniform dimension
    :param probs: probability vector of the same length as the list of pure states
    """
    rhos = (psi.density_matrix for psi in pure_states)
    return sum(p * rho for p, rho in zip(probs, rhos))
