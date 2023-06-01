import numpy as np

from operation import X, I
from state import Qubit

L = 0.5 * np.block([[I, X], [X, -I]])


def chi_1q(qst_estimates: np.ndarray) -> np.ndarray:
    """
    Extract the chi matrix for a process E, wrt the basis [I, X, -iY, Z], using the results of
    quantum state tomography on the states E(|0><0|), E(|1><1|), E(|+><+|), E(|-><-|).
    :param qst_estimates: a stack of four 2 x 2 arrays, each containing the results of post-process QST
    :return:
    """
    # Unpack the stacked array to reveal QST estimates for E(|0><0|), E(|1><1|), E(|+><+|), E(|-><-|), respectively
    qst_zero, qst_one, qst_plus, qst_minus = qst_estimates
    # TODO: pull this basis change into a separate function
    # Work in the [|0><0|, |0><1|, |1><0|, |1><1|] basis for the space of operators
    rho_00_prime = qst_zero
    rho_01_prime = qst_plus + 1j * qst_minus - 0.5 * (1 + 1j) * (qst_zero + qst_one)
    rho_10_prime = qst_plus - 1j * qst_minus - 0.5 * (1 - 1j) * (qst_zero + qst_one)
    rho_11_prime = qst_one
    chi = L @ np.block([[rho_00_prime, rho_01_prime], [rho_10_prime, rho_11_prime]]) @ L
    return chi


def basis_change_2q_op():
    # TODO: code for switching to the basis [|00><00|, ..., |11><11|] for the space of 2Q operators
    pass


def chi_2q(qst_estimates: np.ndarray) -> np.ndarray:
    """

    :param qst_estimates: a stack of sixteen 4 x 4 arrays, each containing the results of post-process QST
    :return:
    """
    rhos_prime = basis_change_2q_op(qst_estimates)  # 16-long array of 4 x 4 matrices
    rho_prime_block = np.block(rhos_prime.reshape((4, 4)))  # !?

    # TODO: precompute and hardcode permutation
    T1 = np.kron(I, I)
    T2 = np.kron(I, X)
    T3 = np.kron(X, I)

    rho_00 = np.zeros((4, 4))
    rho_00[0, 0] = 1.0

    rho_12 = T1 @ rho_00 @ T2
    rho_21 = T2 @ rho_00 @ T1
    rho_33 = T3 @ rho_00 @ T3

    P = np.kron(I, np.kron(rho_00 + rho_12 + rho_21 + rho_33, I))

    rho_bar_prime = P.transpose() @ rho_prime_block @ P
    chi = np.kron(L, L) @ rho_bar_prime @ np.kron(L, L)

    return chi


# Initial/input states for 1Q process
q_zero = Qubit(1.0, 0.0)
q_one = Qubit(0.0, 1.0)
q_plus = Qubit(1.0, 1.0)
q_minus = Qubit(1.0, 1.0j)  # N.B.: this is different from the usual definition of |->

# Initial/input states for 2Q process


# These states undergo a quantum operation E. The resulting states are characterized
# via state tomography, giving us four density matrices.
# For an ideal identity operation, the results of (ideal) state tomography are:
# qst_zero = q_zero.density_matrix
# qst_one = q_one.density_matrix
# qst_plus = q_plus.density_matrix
# qst_minus = q_minus.density_matrix

# Basis for space of operators: {|0><0|, |0><1|, |1><0|, |1><1|} (denoted rho_00 through rho_11)
# These get mapped to their primed versions:
# rho_prime_00 = qst_zero
# rho_prime_01 = qst_plus + 1j * qst_minus - 0.5 * (1 - 1j) * (qst_zero + qst_one)
# rho_prime_10 = qst_plus - 1j * qst_minus - 0.5 * (1 + 1j) * (qst_zero + qst_one)
# rho_prime_11 = qst_one

# QPT-estimated chi matrix for the identity operation:
# identity_chi = chi_1q(
#     rho_prime_00=rho_prime_00,
#     rho_prime_01=rho_prime_01,
#     rho_prime_10=rho_prime_10,
#     rho_prime_11=rho_prime_11
# )
