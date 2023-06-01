import numpy as np

from qpt import chi_1q
from state import Qubit


def mock_qst():
    pass


def test_chi_1q_identity():
    """
    Running QPT with an identity process.
    Input states |0>, |1>, |+>, |-> are left unchanged under the identity process.
    Running an idealized QST on the post-process states should yield exactly the initial states.
    """
    qst_estimates = np.stack([
        Qubit(1.0, 0.0).density_matrix,
        Qubit(0.0, 1.0).density_matrix,
        Qubit(1.0, 1.0).density_matrix,
        Qubit(1.0, 1.0j).density_matrix
    ])

    # the true chi matrix for the identity op has 1 in the (0, 0) position, 0 elsewhere
    identity_chi = np.zeros([4, 4])
    identity_chi[0, 0] = 1.0

    # estimated chi (from QPT):
    chi_estimate = chi_1q(qst_estimates)
    assert np.isclose(chi_estimate, identity_chi).all()


# TODO: fill in analogous tests for simple processes corresponding to X, Y, Z operations.
# TODO: requires computation (by hand? symbolic?) of the "true" chi matrices.
def test_chi_1q_x():
    assert False


def test_chi_1q_y():
    assert False


def test_chi_1q_z():
    assert False
